package src.lessons.lesson_10.P04_LoginPage;
public class LoginFlow {
    private String username;
    private String password;

    public LoginFlow(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void loginPageWithCreds(LoginPage loginPage) {
        loginPage.inputUsername(username);
        loginPage.inputPassword(password);
        loginPage.clickOnLoginBtn();
    }
}
