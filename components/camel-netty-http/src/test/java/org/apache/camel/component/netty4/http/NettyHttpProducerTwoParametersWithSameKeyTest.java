/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.netty4.http;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.junit.Test;

public class NettyHttpProducerTwoParametersWithSameKeyTest extends BaseNettyTest {

    @Test
    public void testTwoParametersWithSameKey() throws Exception {
        Exchange out = template.request("netty-http:http://localhost:{{port}}/myapp?from=me&to=foo&to=bar", null);

        assertNotNull(out);
        assertFalse("Should not fail", out.isFailed());
        assertEquals("OK", out.getOut().getBody(String.class));
        assertEquals("yes", out.getOut().getHeader("bar"));

        List<?> foo = out.getOut().getHeader("foo", List.class);
        assertNotNull(foo);
        assertEquals(2, foo.size());
        assertEquals("123", foo.get(0));
        assertEquals("456", foo.get(1));
    }

    @Test
    public void testTwoHeadersWithSameKeyHeader() throws Exception {
        Exchange out = template.request("netty-http:http://localhost:{{port}}/myapp", new Processor() {
            public void process(Exchange exchange) throws Exception {
                exchange.getIn().setBody(null);
                exchange.getIn().setHeader("from", "me");
                List<String> list = new ArrayList<>();
                list.add("foo");
                list.add("bar");
                exchange.getIn().setHeader("to", list);
            }
        });

        assertNotNull(out);
        assertFalse("Should not fail", out.isFailed());
        assertEquals("OK", out.getOut().getBody(String.class));
        assertEquals("yes", out.getOut().getHeader("bar"));

        List<?> foo = out.getOut().getHeader("foo", List.class);
        assertNotNull(foo);
        assertEquals(2, foo.size());
        assertEquals("123", foo.get(0));
        assertEquals("456", foo.get(1));
    }

    @Override
    protected RouteBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                from("netty-http:http://localhost:{{port}}/myapp").process(new Processor() {
                    public void process(Exchange exchange) throws Exception {
                        String from = exchange.getIn().getHeader("from", String.class);
                        assertEquals("me", from);

                        List<?> to = exchange.getIn().getHeader("to", List.class);
                        assertNotNull(to);
                        assertEquals(2, to.size());
                        assertEquals("foo", to.get(0));
                        assertEquals("bar", to.get(1));

                        // response
                        exchange.getOut().setBody("OK");
                        // use multiple values for the foo header in the reply
                        List<Integer> list = new ArrayList<>();
                        list.add(123);
                        list.add(456);
                        exchange.getOut().setHeader("foo", list);
                        exchange.getOut().setHeader("bar", "yes");
                    }
                });
            }
        };
    }

}
