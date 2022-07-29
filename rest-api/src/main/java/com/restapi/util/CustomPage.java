package com.restapi.util;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;

import java.util.List;

@Data
@NoArgsConstructor
public class CustomPage <T>{

    private List<T> content;
    private int pageNumber;
    private int pageSize;
    private Sort sort;
    private int totalPages;
    private long totalElement;

    public CustomPage(Page page,List<T> list) {
        this.content = content;
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
        this.sort = sort;
        this.totalPages = totalPages;
        this.totalElement = totalElement;
    }
}
