/*
 *  
 * The MIT License (MIT)
 * Copyright (c) 2018 Roberto Villarejo Martínez
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package mx.infotec.dads.kukulkan.tables.handsontable;

import java.io.Serializable;

/**
 * A Numeric column (also called cell type)
 * 
 * @author Roberto Villarejo Martínez
 *
 */
public class NumericColumn extends Column {

    /**
     * 
     */
    private static final long serialVersionUID = -7520540712401891657L;

    private NumericFormat numericFormat = new NumericFormat();

    public NumericColumn() {
        super();
    }

    public NumericColumn(HandsontableOptions options) {
    }

    public NumericFormat getNumericFormat() {
        return numericFormat;
    }

    public void setNumericFormat(NumericFormat numericFormat) {
        this.numericFormat = numericFormat;
    }

    public NumericColumn withNumericFormat(NumericFormat numericFormat) {
        this.numericFormat = numericFormat;
        return this;
    }

    @Override
    public Type getType() {
        return Type.NUMERIC;
    }

    public class NumericFormat implements Serializable {
        /**
         * 
         */
        private static final long serialVersionUID = -747188278509123735L;
        String pattern = "0,00.00";
        String culture = "es-MX";

        public NumericFormat() {
        }

        public NumericFormat(String pattern) {
            this.pattern = pattern;
        }

        public String getPattern() {
            return pattern;
        }

        public void setPattern(String pattern) {
            this.pattern = pattern;
        }

        public String getCulture() {
            return culture;
        }

        public void setCulture(String culture) {
            this.culture = culture;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getSimpleName());
            sb.append(" [");
            sb.append("Hash = ").append(hashCode());
            sb.append(", pattern=").append(pattern);
            sb.append(", culture=").append(culture);
            sb.append("]");
            return sb.toString();
        }
    }

}
