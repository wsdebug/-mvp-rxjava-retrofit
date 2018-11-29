package bean;



public class DescriptionDetail {
    private String title_right;
    private String title_head;
    private String title;//二级标题
    private String content_one;
    private String content_two;//二级内容

    public String getTitle_right() {
        return title_right;
    }

    public void setTitle_right(String title_right) {
        this.title_right = title_right;
    }

    public String getTitle_head() {
        return title_head;
    }

    public void setTitle_head(String title_head) {
        this.title_head = title_head;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent_one() {
        return content_one;
    }

    public void setContent_one(String content_one) {
        this.content_one = content_one;
    }

    public String getContent_two() {
        return content_two;
    }

    public void setContent_two(String content_two) {
        this.content_two = content_two;
    }
}
