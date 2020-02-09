import model.ChromeProgram;
import model.IntellijProgram;
import model.WechatProgram;
import model.WindowsProgram;

public class Application {
    public static void main(String[] args) {
        WindowsProgram intellijIdea = new IntellijProgram();
        WindowsProgram chrome = new ChromeProgram();
        WindowsProgram wechat = new WechatProgram();
        
        intellijIdea.pressF5();
        chrome.pressF5();
        wechat.pressF5();
    }
}
