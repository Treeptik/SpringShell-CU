/*
 * Copyright 2011-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.shell.support.util;

/**
 * Utilities for handling OS-specific behavior.
 * 
 * @author Joris Kuipers
 * @since 1.1.1
 */
public class OsUtils {

	public static final String LINE_SEPARATOR = System
			.getProperty("line.separator");

	private static final boolean WINDOWS_OS = System.getProperty("os.name")
			.toLowerCase().contains("windows");

	public static boolean isWindows() {
		return WINDOWS_OS;
	}
}
