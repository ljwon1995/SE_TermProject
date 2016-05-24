package application;


import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;
import javafx.stage.Window;

public class MainController implements Initializable {

	
	private SMergeModel model = new SMergeModel();
	
	@FXML
	private ListView<String> sss;
	
	
	@FXML
	private ImageView btnEdit_L, btnEdit_R;
	
	@FXML
	private ImageView btnOpen_L, btnOpen_R;
	
	@FXML
	private TextArea textArea_L, textArea_R;
	
	@FXML
	private TitledPane titledPane_L, titledPane_R;
	
	@FXML
	public void edit_L()
	{
		textArea_L.requestFocus();
		textArea_L.setEditable(!textArea_L.isEditable());
	}
	
	@FXML
	public void edit_R()
	{
		ObservableList<String> items = FXCollections.observableArrayList("S", "SS", "SSSS");
		
		sss.setItems(items);
	
		
		textArea_R.requestFocus();
		textArea_R.setEditable(!textArea_R.isEditable());
	}
	@FXML
	public void open_L(){
	
		File file;
		FileChooser fc = new FileChooser();
		try{
			file = fc.showOpenDialog(null);
			titledPane_L.setText(file.getAbsolutePath());
			titledPane_L.setDisable(false);
			model.setleftFile(file);
			model.setleftPath(file.getAbsolutePath());
			model.leftLoad();
		}
		catch(NullPointerException e){
			//do nothing
		}
		
	}

	@FXML
	public void open_R(){
	
		File file;
		FileChooser fc = new FileChooser();
		try{
			file = fc.showOpenDialog(null);
			titledPane_R.setText(file.getAbsolutePath());
			titledPane_R.setDisable(false);
			model.setrightFile(file);
			model.setrightPath(file.getAbsolutePath());
			model.rightLoad();
		}
		catch(NullPointerException e){
			//do nothing
		}
		
	}
	
	@FXML
	public void save_L()
	{
		StringBuilder leftTxt = null;
		
		/*
		 * titlePane_L 에서 text area 에 있는 값 반환해서 leftTxt에 넣어주기 (형주)
		 */
		
		model.leftSave(leftTxt);
		
		
	}
	
	@FXML
	public void save_R()
	{
		StringBuilder rightTxt = null;
		
		/*
		 * titlePane_R 에서 text area 에 있는 값 반환해서 rightTxt에 넣어주기(형주) 
		 */
		
		model.rightSave(rightTxt);
	}
	@FXML
	public void save_All()
	{
		//not yet;;;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
	}
	
}
