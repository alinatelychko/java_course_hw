package OOP_HW1.secondTask;

public class Content {
    private String article;

    public Content(String article) {
        this.article = article;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public void show (){
        System.out.println("Koнтент: " + article);
    }

}
