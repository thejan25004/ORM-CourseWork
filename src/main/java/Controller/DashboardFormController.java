package Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
public class DashboardFormController {
    @FXML
    private TableColumn<?, ?> colDate;

    @FXML
    private TableColumn<?, ?> colId;

    @FXML
    private TableColumn<?, ?> colName;

    @FXML
    private AnchorPane dashboardForm;

    @FXML
    private Label lblTotalPrograms;

    @FXML
    private Label lblTotalStudent;

    @FXML
    private TableView<?> tblStudyAll;
}
