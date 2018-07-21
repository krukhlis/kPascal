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
package com.khubla.kpascal.listener;

import java.util.ArrayList;
import java.util.List;

import com.khubla.kpascal.ExecutionContext;
import com.khubla.kpascal.value.Value;
import com.khubla.pascal.pascalParser;
import com.khubla.pascal.pascalParser.ConstantContext;

public class ConstListListener extends AbstractPascalListener {
   private final List<Value> constants = new ArrayList<Value>();

   public ConstListListener(ExecutionContext executionContext) {
      super(executionContext);
   }

   @Override
   public void enterConstList(pascalParser.ConstListContext ctx) {
      if (null != ctx.constant()) {
         for (final ConstantContext constantContext : ctx.constant()) {
            final ConstantListener constantListener = new ConstantListener(getExecutionContext());
            constantListener.enterConstant(constantContext);
            constants.add(constantListener.getValue());
         }
      }
   }

   @Override
   public void exitConstList(pascalParser.ConstListContext ctx) {
   }

   public List<Value> getConstants() {
      return constants;
   }
}