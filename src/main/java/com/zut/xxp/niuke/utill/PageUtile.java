package com.zut.xxp.niuke.utill;

public class PageUtile {

    private Integer cows=0;
    private Integer current=1;
    private Integer limit=10;
    private String path="/index";

    public int getForm(){
        int from = ( current - 1 ) * limit;
        return from < 0 ? 0 : from;
    }

//    public int getTotalPage(){
//        if (cows%current==0){
//            return cows/current;
//        }else {
//            return cows/current+1;
//        }
//    }

    public int getPreCurrent(){
        int page = current - 2;
        return page < 1 ? 1 : page;
    }

    public int getPostCurrent(){
        int page = current + 2;
//        if (page * limit > getCows()){
//            return getEnd();
//        }
        int end = getEnd();
        return page>end?end:page;
    }

    public int getEnd(){
        if (getCows() % getLimit()!= 0){
            return getCows() / getLimit() + 1;
        }else {
            return getCows() / getLimit();
        }
    }

    @Override
    public String toString() {
        return "PageUtile{" +
                "cows=" + cows +
                ", current=" + current +
                ", limit=" + limit +
                ", path='" + path + '\'' +
                '}';
    }

    public int getCows() {
        return cows;
    }

    public void setCows(Integer cows) {
        this.cows = cows;
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(Integer current) {
        this.current = current;
    }

    /**
     *  体会到自己写的bug坑自己了。牛逼
     * @return
     */
//    public int getLimit() {
//        int limit = this.limit;
//        if (this.limit>100){
//            limit=100;
//        }
//        if (getForm()+limit > cows){
//            limit=getCows()-getForm();
//            return limit;
//        }
//
//        return this.limit;
//    }
    public int getLimit() {
        int limit = this.limit;
        if (this.limit>100){
            limit=100;
            return limit;
        }

        return this.limit;
    }

    public void setLimit(Integer limit) {
        System.out.println("setLimit:"+limit);
        this.limit = limit;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public PageUtile(Integer current) {
        this.current = current;
    }

    public PageUtile() {
    }

    public PageUtile(Integer cows, Integer current, Integer limit, String path) {
        this.cows = cows;
        this.current = current;
        this.limit = limit;
        this.path = path;
    }
}
