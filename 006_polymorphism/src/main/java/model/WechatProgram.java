package model;

public class WechatProgram extends WindowsProgram {
    @Override
    public void pressF5() {
        super.pressF5();
        System.out.println("弹出英文输出框");
    }
}
