package it.unimi.dsi.fastutil.ints;

/*
 * Copyright (C) 2020 Sebastiano Vigna
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.Test;

public class Int2IntArrayMapTest {
	@Test
	public void testCopyConstructor() {
		final Int2IntOpenHashMap m = new Int2IntOpenHashMap(new int [] {1, 2}, new int[] {3, 4});
		assertEquals(new Int2IntArrayMap(m), m);
		assertEquals(new HashMap<>(m), m);
	}
}