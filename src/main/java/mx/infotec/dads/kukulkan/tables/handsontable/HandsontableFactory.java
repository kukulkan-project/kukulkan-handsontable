package mx.infotec.dads.kukulkan.tables.handsontable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import mx.infotec.dads.kukulkan.tables.handsontable.AnnotationBuildStrategy;
import mx.infotec.dads.kukulkan.tables.handsontable.Column;
import mx.infotec.dads.kukulkan.tables.handsontable.Handsontable;
import mx.infotec.dads.kukulkan.tables.handsontable.BuildStrategy;

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

/**
 * A Factory for Handsontable building
 * @author Roberto Villarejo Martínez
 *
 */
public final class HandsontableFactory {

    private HandsontableFactory() {
    }

    /**
     * Creates a Handsontable of type <T> with given {@link BuildStrategy} strategy
     * @param clazz
     * @param strategy
     * @return the Handsontable
     */
    public static <T> Handsontable<T> getHandsontable(Class<T> clazz, BuildStrategy strategy) {
        Handsontable<T> table = new Handsontable<>();
        Field[] fields = clazz.getDeclaredFields();
        List<String> colHeaders = new ArrayList<>();
        List<Column> columns = new ArrayList<>();
        for (Field field : fields) {
            Column col = strategy.buildColumn(field);
            if (col != null) {
                columns.add(col);

            }
            String header = strategy.builderHeader(field);
            if (header != null) {
                colHeaders.add(header);
            }
        }
        table.withOptions(strategy.buildOptions(clazz));
        table.withColHeaders(colHeaders);
        table.withColumns(columns);
        return table;
    }

    /**
     * Creates a Handsontable of type <T>
     * @param clazz
     * @return
     */
    public static <T> Handsontable<T> createHandsontable(Class<T> clazz) {
        return getHandsontable(clazz, new AnnotationBuildStrategy());
    }

}
