public class Historia {

    private  String text;
    private String image;

    //@param text

    public Historia(String text, String image){
        this.image = image;
        this.text = text;
    }
    public String getText() {
            return text;
        }
    public void setText(String text) {
            this.text = text;
        }
    public String getImage() {
            return image;
        }
    public void setImage(String image) {
            this.image = image;
        }
}

