/*
 * kPascal Copyright 2018, Tom Everett
 *
 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *    This program is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *    GNU General Public License for more details.
 *
 *    You should have received a copy of the GNU General Public License
 *    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.khubla.kpascal.runtime.function.math;

import java.util.List;
import java.util.Random;

import com.khubla.kpascal.ExecutionContext;
import com.khubla.kpascal.exception.InterpreterException;
import com.khubla.kpascal.value.IntegerValue;
import com.khubla.kpascal.value.Value;

public class RandomFunction extends MathFunction {
   private final Random random = new Random();

   @Override
   public Value execute(ExecutionContext executionContext, List<Value> args) {
      if (null != args) {
         final int max = getInteger(args.get(0));
         final int r = random.nextInt((max - 1) + 1) + 1;
         return new IntegerValue(r);
      } else {
         throw new InterpreterException("Invalid argument");
      }
   }
}
