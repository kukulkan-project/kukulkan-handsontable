package mx.infotec.dads.kukulkan.tables.handsontable;

import java.util.Iterator;
import java.util.List;

import org.springframework.core.convert.converter.Converter;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.domain.Sort;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * A Handsontable Slice
 * 
 * @author Roberto Villarejo Martínez
 *
 * @param <T>
 */
public class HandsontableSlice<T> extends Handsontable<T> implements Slice<T> {

    /**
     * 
     */
    private static final long serialVersionUID = -8044172177535025004L;
    private transient Slice<T> slice;
    private Handsontable<T> table;

    public HandsontableSlice(Handsontable<T> table, Slice<T> slice) {
        super(table);
        this.slice = slice;
        this.table = table;
    }

    @Override
    public List<T> getData() {
        return slice.getContent();
    }

    @Override
    public void setData(List<T> data) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<Column> getColumns() {
        return table.getColumns();
    }

    @Override
    public void setColumns(List<Column> columns) {
        table.setColumns(columns);
    }

    @Override
    public HandsontableSlice<T> withData(List<T> data) {
        table.setData(data);
        return this;
    }

    @Override
    public HandsontableSlice<T> withColumns(List<Column> columns) {
        table.setColumns(columns);
        return this;
    }

    @Override
    public HandsontableSlice<T> withOptions(HandsontableOptions options) {
        this.options = options;
        return this;
    }

    @JsonIgnore
    @Override
    public Iterator<T> iterator() {
        return slice.iterator();
    }

    @JsonIgnore
    @Override
    public int getNumber() {
        return slice.getNumber();
    }

    @JsonIgnore
    @Override
    public int getSize() {
        return slice.getSize();
    }

    @JsonIgnore
    @Override
    public int getNumberOfElements() {
        return slice.getNumberOfElements();
    }

    @JsonIgnore
    @Override
    public List<T> getContent() {
        return slice.getContent();
    }

    @JsonIgnore
    @Override
    public boolean hasContent() {
        return slice.hasContent();
    }

    @JsonIgnore
    @Override
    public Sort getSort() {
        return slice.getSort();
    }

    @JsonIgnore
    @Override
    public boolean isFirst() {
        return slice.isFirst();
    }

    @JsonIgnore
    @Override
    public boolean isLast() {
        return slice.isLast();
    }

    @JsonIgnore
    @Override
    public boolean hasNext() {
        return slice.hasNext();
    }

    @JsonIgnore
    @Override
    public boolean hasPrevious() {
        return slice.hasPrevious();
    }

    @JsonIgnore
    @Override
    public Pageable nextPageable() {
        return slice.nextPageable();
    }

    @JsonIgnore
    @Override
    public Pageable previousPageable() {
        return slice.previousPageable();
    }

    @JsonIgnore
    @Override
    public <S> Slice<S> map(Converter<? super T, ? extends S> converter) {
        return slice.map(converter);
    }

}
