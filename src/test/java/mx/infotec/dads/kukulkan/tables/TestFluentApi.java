package mx.infotec.dads.kukulkan.tables;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.json.JSONException;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import junit.framework.TestCase;
import mx.infotec.dads.kukulkan.tables.UserDTO.Genre;
import mx.infotec.dads.kukulkan.tables.handsontable.Column;
import mx.infotec.dads.kukulkan.tables.handsontable.Handsontable;
import mx.infotec.dads.kukulkan.tables.handsontable.columns.CheckboxColumn;
import mx.infotec.dads.kukulkan.tables.handsontable.columns.DateColumn;
import mx.infotec.dads.kukulkan.tables.handsontable.columns.DropdownColumn;
import mx.infotec.dads.kukulkan.tables.handsontable.columns.NumericColumn;
import mx.infotec.dads.kukulkan.tables.handsontable.columns.TextColumn;
import mx.infotec.dads.kukulkan.tables.handsontable.columns.TimeColumn;

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

public class TestFluentApi extends TestCase {

    @Test
    public void testValidHandsontableObject() throws JsonProcessingException, JSONException {
        String json = TestUtils.getResourceFileAsString("handsontable.json");
        Handsontable<UserDTO> table = getHandsontable();
        ObjectMapper mapper = new ObjectMapper();
        System.out.println(mapper.writeValueAsString(table));
        JSONAssert.assertEquals(json, mapper.writeValueAsString(table), JSONCompareMode.LENIENT);
    }

    public static Handsontable<UserDTO> getHandsontable() {
        Handsontable<UserDTO> table = new Handsontable<>();
        List<String> colHeaders = new ArrayList<>();
        colHeaders.add("ID");
        colHeaders.add("Login");
        colHeaders.add("Email");
        colHeaders.add("Activated");
        colHeaders.add("Lang Key");
        colHeaders.add("Authorities");
        colHeaders.add("Created Date");
        colHeaders.add("Last Modified By");
        colHeaders.add("Last Modified Date");
        colHeaders.add("Genre");
        colHeaders.add("Last Login");
        colHeaders.add("Followers");

        List<Column> columns = new ArrayList<>();
        columns.add(new TextColumn().withData("id"));
        columns.add(new TextColumn().withData("login"));
        columns.add(new TextColumn().withData("email"));
        columns.add(new CheckboxColumn().withData("activated"));
        columns.add(new TextColumn().withData("langKey"));
        columns.add(new TextColumn().withData("authorities"));
        columns.add(new DateColumn().withData("createdDate"));
        columns.add(new TextColumn().withData("lastModifiedBy"));
        columns.add(new DateColumn().withData("lastModifiedDate"));
        columns.add(new DropdownColumn().withData("genre")
                .withSource(Arrays.stream(UserDTO.Genre.values()).map(Object::toString).collect(Collectors.toList())));
        columns.add(new TimeColumn().withData("lastLogin"));
        NumericColumn followersColumn = new NumericColumn();
        followersColumn.getNumericFormat().setPattern("0,00");
        columns.add(followersColumn.withData("followers"));

        table.withData(getUsersData()).withColumns(columns).withRowHeaders(true).withColHeaders(colHeaders)
                .withHeight(440).withContextMenu(true).withMinSpareRows(true).withColumnSorting(true).withColWidths(125)
                .withRowHeights(25).withMinRows(20).withReadOnly(true);
        return table;

    }

    public static List<UserDTO> getUsersData() {
        List<UserDTO> users = new ArrayList<>();
        Set<String> authorities = new HashSet<>();
        authorities.add("ROLE_USER");
        UserDTO user = new UserDTO("user-33", "admin", "firstName", "lastName", "admin@infotec.mx", true, null, "es",
                "system", "14/02/18 14:05", "system", "14/02/18 14:05", authorities, Genre.MALE, "10:15:30", 987654321);
        users.add(user);
        return users;
    }

}
