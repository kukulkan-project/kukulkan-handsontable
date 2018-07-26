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
import java.util.Locale;

public class NumericColumn extends Column {

    /**
     * 
     */
    private static final long serialVersionUID = 8966012580478857767L;

    private NumericFormat numericFormat;

    public NumericColumn() {
        super.withType(CellTypes.NUMERIC);
    }

    public NumericFormat getNumericFormat() {
        return numericFormat;
    }

    public void setNumericFormat(NumericFormat numericFormat) {
        this.numericFormat = numericFormat;
    }

    public class NumericFormat implements Serializable {

        /**
         * 
         */
        private static final long serialVersionUID = 1L;
        private String pattern;
        private Locale culture;

        public String getPattern() {
            return pattern;
        }

        public void setPattern(String pattern) {
            this.pattern = pattern;
        }

        public Locale getCulture() {
            return culture;
        }

        public void setCulture(Locale culture) {
            this.culture = culture;
        }

    }

}
