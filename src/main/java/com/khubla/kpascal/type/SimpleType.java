package com.khubla.kpascal.type;

import com.khubla.kpascal.value.SimpleValue;
import com.khubla.kpascal.value.Value;

/*
* kPascal Copyright 2015, khubla.com
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
public class SimpleType implements Type {
   public enum Type {
      real, string, integer, bool, character;
   }

   private Type type;

   public SimpleType(Type type) {
      this.type = type;
   }

   @Override
   public Value createValue() {
      return new SimpleValue(this);
   }

   public Type getType() {
      return type;
   }

   public void setType(Type type) {
      this.type = type;
   }
}
