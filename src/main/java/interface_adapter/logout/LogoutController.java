package interface_adapter.logout;

import use_case.logout.LogoutInputBoundary;

/**
 * The controller for the Logout Use Case.
 */
public class LogoutController {

    private LogoutInputBoundary logoutUseCaseInteractor;

    public LogoutController(LogoutInputBoundary logoutUseCaseInteractor) {
        // Save the interactor in the instance variable.
        this.logoutUseCaseInteractor = logoutUseCaseInteractor;
    }

    /**
     * Executes the Logout Use Case.
     */
    public void execute() {
        // run the use case interactor for the logout use case
        logoutUseCaseInteractor.execute();
    }
}
