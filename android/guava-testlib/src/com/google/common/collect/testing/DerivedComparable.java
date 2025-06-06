/*
 * Copyright (C) 2010 The Guava Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.common.collect.testing;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;

/**
 * Simple derived class to verify that we handle generics correctly.
 *
 * @author Kevin Bourrillion
 */
@GwtCompatible
public class DerivedComparable extends BaseComparable {
  public DerivedComparable(String s) {
    super(s);
  }

  @GwtIncompatible @J2ktIncompatible private static final long serialVersionUID = 0;
}
