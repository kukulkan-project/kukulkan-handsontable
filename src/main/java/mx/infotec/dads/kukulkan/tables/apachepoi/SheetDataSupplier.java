package mx.infotec.dads.kukulkan.tables.apachepoi;

import java.util.function.Function;
import java.util.function.Supplier;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.domain.SliceImpl;

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

public class SheetDataSupplier<T> implements Supplier<Slice<T>> {

    private Function<Pageable, Page<T>> function;

    private boolean hasNext = false;

    private Pageable pageable;

    private int pageNumber = 0;

    private int sizePage = 100;

    public SheetDataSupplier(Function<Pageable, Page<T>> function) {
        this.function = function;
        this.pageable = new PageRequest(pageNumber, sizePage);
    }

    @Override
    public Slice<T> get() {
        if (pageable.getPageNumber() == 0 || hasNext) {
            Page<T> page = function.apply(pageable);
            hasNext = page.hasNext();
            pageable = new PageRequest(pageable.getPageNumber() + 1, sizePage);
            return new SliceImpl<>(page.getContent(), pageable, page.hasNext());
        }
        return null;
    }

}