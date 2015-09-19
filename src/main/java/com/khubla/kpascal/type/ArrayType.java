package com.khubla.kpascal.type;

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
public class ArrayType implements Type {
   private int lowerRange;
   private int upperRange;
   private Type componentType;

   public Type getComponentType() {
      return componentType;
   }

   public int getLowerRange() {
      return lowerRange;
   }

   public int getUpperRange() {
      return upperRange;
   }

   public void setComponentType(Type componentType) {
      this.componentType = componentType;
   }

   public void setLowerRange(int lowerRange) {
      this.lowerRange = lowerRange;
   }

   public void setUpperRange(int upperRange) {
      this.upperRange = upperRange;
   }
}
