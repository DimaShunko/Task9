package example;

public class GettingResult {
    private String cmd;
    private String a;
    private String b;
    private int result;
    private String error;

    public GettingResult() {
    }

    public GettingResult(String cmd, String a, String b, int result) {
        this.cmd = cmd;
        this.a = a;
        this.b = b;
        this.result = result;
    }

    public GettingResult(String cmd, String a, String b, String error) {
        this.cmd = cmd;
        this.a = a;
        this.b = b;
        this.error = error;
    }

    public String getCmd() {
        return cmd;
    }

    public void setCmd(String cmd) {
        this.cmd = cmd;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
