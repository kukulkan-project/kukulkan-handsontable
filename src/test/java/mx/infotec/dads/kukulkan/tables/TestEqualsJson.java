package mx.infotec.dads.kukulkan.tables;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import junit.framework.TestCase;
import mx.infotec.dads.kukulkan.tables.CheckboxColumn;
import mx.infotec.dads.kukulkan.tables.handsontable.Column;
import mx.infotec.dads.kukulkan.tables.Handsontable;

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

public class TestEqualsJson extends TestCase {
    
    private Handsontable table;

    @Test
    public void testFluentApi() throws JsonProcessingException {
        table = new Handsontable();
        
        List<String> colHeaders = new ArrayList<>();
        colHeaders.add("ID");
        colHeaders.add("Login");
        colHeaders.add("Email");
        colHeaders.add("Active");
        colHeaders.add("Language");
        colHeaders.add("Profiles");
        colHeaders.add("Created date");
        colHeaders.add("Modified by");
        colHeaders.add("Modified date");
        
        List<Column> columns = new ArrayList<>();
        columns.add(new Column().withData("id").withReadOnly(true));
        columns.add(new Column().withData("login").withReadOnly(true));
        columns.add(new Column().withData("email").withReadOnly(true));
        columns.add(new CheckboxColumn().withData("active").withReadOnly(true));
        columns.add(new Column().withData("language").withReadOnly(true));
        columns.add(new Column().withData("profiles").withReadOnly(true));
        columns.add(new Column().withData("createdDate").withReadOnly(true));
        columns.add(new Column().withData("modifiedBy").withReadOnly(true));
        columns.add(new Column().withData("modifiedDate").withReadOnly(true));
        
        table
            .withRowHeaders(true)
            .withColHeaders(colHeaders)
            .withHeight(440.0)
            .withContextMenu(true)
            .withMinSpareRows(true)
            .withColumnSorting(true)
            .withColWidths(125.0)
            .withRowHeights(25.0)
            .withMinRows(20.0)
            .withData(new ArrayList<>())
            .withColumns(columns);
        
        ObjectMapper mapper = new ObjectMapper();
        System.out.println(mapper.writeValueAsString(table));
    }

}
