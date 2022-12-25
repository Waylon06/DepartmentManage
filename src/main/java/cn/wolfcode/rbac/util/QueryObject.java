package cn.wolfcode.rbac.util;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QueryObject {
    private int currentPage = 1;
    private int pageSize = 5;

    public int getStartIndex() {
        return pageSize * (currentPage - 1);
    }
}
