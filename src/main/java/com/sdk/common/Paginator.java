package com.sdk.common;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Paginator<T> {

    private PaginatorCallback<T> actionCallBack;
    private boolean hasNext = true;
    private String nextId ="*";
    private int pageNo=0;
    private String pageType;
    private int pageSize;


    public Paginator(int pageSize, String pageType) {
        this.pageSize = pageSize;
        this.pageType = pageType;
        if(pageType.equalsIgnoreCase("cursor")) {
            this.nextId = "*";
        } else {
            this.pageNo = 0;
        }
    }

    public boolean hasNext(){
        return hasNext;
    }

    public void setPaginator(boolean hasNext , String nextId, int pageNo) {
        this.hasNext = hasNext;
        this.nextId = nextId;
        this.pageNo = pageNo;
    }

    public T next() {
        return actionCallBack.onNext();
    }

    public void reset() {
        this.hasNext = true;
        this.nextId = "*";
        this.pageNo = 0;
    }

    public void setCallback(PaginatorCallback<T> callback) {
        this.actionCallBack = callback;
    }
}
