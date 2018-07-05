package ci1322.compiler;

/**
 * Created by alexiaborchgrevink on 7/3/18.
 */
public class TError {

    String token;
    String type;
    String description;
    int line;
    int column;

    public TError(String token, String type, String description, int line, int column){
        this.token=token;
        this.type=type;
        this.description=description;
        this.line=line;
        this.column=column;
    }
}
