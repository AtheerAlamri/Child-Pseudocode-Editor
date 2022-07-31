package childeditor;

public class Token {

    private int LineNum;
    private String Token;
    private String Type;

    public Token(int LineNum, String Token, String Type) {
        this.LineNum = LineNum;
        this.Token = Token;
        this.Type = Type;

    }

    public void setLineNum(int LineNum) {
        this.LineNum = LineNum;

    }

    public int getLineNum() {

        return LineNum;
    }

    public void setToken(String Token) {
        this.Token = Token;

    }

    public String getToken() {
        return Token;
    }

    public void setType(String Type) {
        this.Type = Type;

    }

    public String getType() {
        return Type;
    }

}
