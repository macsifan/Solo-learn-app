package Project;


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.*;
import java.util.Scanner;

public class Login extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage mainStage) {
        mainStage.setResizable(false);
        Pane pane = new Pane();
        Scene sceneLogIn = new Scene(pane, 888, 668);
        sceneLogIn.getStylesheets().add(getClass().getResource("style.css").toString());

        File file = new File("C:/Users/STRIX/Desktop/progi/sign_in.png");
        Image image = new Image(file.toURI().toString());
        javafx.scene.image.ImageView iv = new javafx.scene.image.ImageView(image);
        pane.getChildren().addAll(iv);
        TextField nickname = new TextField();
        nickname.setPromptText("Nickname");
        PasswordField password = new PasswordField();
        password.setPromptText("Password");
        nickname.setTranslateX(575);
        nickname.setTranslateY(310);
        password.setTranslateX(575);
        password.setTranslateY(405);


        File file1 = new File("C:/Users/STRIX/Desktop/progi/signin.png");
        Image signInImage = new Image(file1.toURI().toString());
        javafx.scene.image.ImageView signInW = new javafx.scene.image.ImageView(signInImage);
        pane.getChildren().add(signInW);
        signInW.getStyleClass().add("image");
        signInW.setTranslateX(620);
        signInW.setTranslateY(507);


        File file2 = new File("C:/Users/STRIX/Desktop/progi/signup.png");
        Image signUpImage = new Image(file2.toURI().toString());
        javafx.scene.image.ImageView signUpW = new javafx.scene.image.ImageView(signUpImage);
        pane.getChildren().add(signUpW);
        signUpW.getStyleClass().add("image");
        signUpW.setTranslateX(740);
        signUpW.setTranslateY(507);


        signInW.setOnMouseClicked(event -> {
            try {
                Scanner it = new Scanner(new FileInputStream("users"));
                int a = 0;
                while (it.hasNextLine()) {
                    if (it.nextLine().equals(nickname.getText() + " " + password.getText())) {
                        a++;
                    }
                }
                if (a == 0) {
                    Label wrongpassword = new Label("Wrong Password or Username");
                    wrongpassword.setId("info");
                    pane.getChildren().addAll(wrongpassword);
                    wrongpassword.setTranslateX(590);
                    wrongpassword.setTranslateY(470);
                } else {
                    Group group = new Group();


                    Scene sceneMain = new Scene(group, 900, 674);
                    sceneMain.getStylesheets().add(getClass().getResource("style.css").toString());
                    Button basicConcept = new Button();
                    basicConcept.setPrefSize(120, 120);
                    basicConcept.setOpacity(0);
                    basicConcept.setStyle("-fx-background-radius:500");
                    basicConcept.setTranslateX(390);
                    basicConcept.setTranslateY(105);

                    Button conditionalandloops = new Button();
                    conditionalandloops.setPrefSize(120, 120);
                    conditionalandloops.setOpacity(0);
                    conditionalandloops.setStyle("-fx-background-radius:500");
                    conditionalandloops.setTranslateX(180);
                    conditionalandloops.setTranslateY(248);


                    basicConcept.setOnAction(event1 -> {
                        File filemain1 = new File("C:/Users/STRIX/Desktop/progi/basic.png");
                        Image imagemain1 = new Image(filemain1.toURI().toString());
                        javafx.scene.image.ImageView ivmain1 = new javafx.scene.image.ImageView(imagemain1);
                        Group group1 = new Group();
                        group1.getChildren().addAll(ivmain1);


                        File file5 = new File("C:/Users/STRIX/Desktop/progi/arrow.png");
                        Image backImageBasic = new Image(file5.toURI().toString());
                        javafx.scene.image.ImageView backBasic = new javafx.scene.image.ImageView(backImageBasic);
                        backBasic.getStyleClass().add("image");
                        backBasic.setFitWidth(20);
                        backBasic.setTranslateX(10);
                        backBasic.setTranslateY(100);


                        Button introduction = new Button();
                        introduction.setPrefSize(180, 180);
                        introduction.setTranslateX(42);
                        introduction.setTranslateY(132);
                        introduction.setOpacity(0);
//
//                        Button introduction = new Button();
//                        introduction.setPrefSize(180, 180);
//                        introduction.setTranslateX(42);
//                        introduction.setTranslateY(132);
////                        introduction.setOpacity(0);

                        group1.getChildren().addAll(backBasic, introduction);
                        Scene scenebasic = new Scene(group1, 900, 674);
                        scenebasic.getStylesheets().add(getClass().getResource("style.css").toString());

                        introduction.setOnAction(event2 -> {

                            Group group2 = new Group();
                            Scene scene2 = new Scene(group2, 900, 674);
                            scene2.getStylesheets().addAll(getClass().getResource("style.css").toString());
                            File file6 = new File("C:/Users/STRIX/Desktop/progi/Basic concepts.png");
                            Image helloworld1 = new Image(file6.toURI().toString());
                            javafx.scene.image.ImageView helloworld = new javafx.scene.image.ImageView(helloworld1);
                            group2.getChildren().addAll(helloworld);

                            File file11 = new File("C:/Users/STRIX/Desktop/progi/arrow.png");
                            Image backImageB = new Image(file11.toURI().toString());
                            javafx.scene.image.ImageView backBasic1 = new javafx.scene.image.ImageView(backImageB);
                            backBasic1.getStyleClass().add("image");
                            backBasic1.setFitWidth(20);
                            backBasic1.setTranslateX(10);
                            backBasic1.setTranslateY(100);

                            backBasic1.setOnMouseClicked(event3 -> {
                                mainStage.setScene(scenebasic);
                            });
                            group2.getChildren().addAll(backBasic1);
                            mainStage.setScene(scene2);

                            //x
                            //x
                            File file7 = new File("C:/Users/STRIX/Desktop/progi/arrow2.png");
                            Image backImageBasic4 = new Image(file7.toURI().toString());
                            javafx.scene.image.ImageView backBasic7 = new javafx.scene.image.ImageView(backImageBasic4);
                            backBasic7.getStyleClass().add("image");
                            backBasic7.setFitWidth(20);
                            backBasic7.setTranslateX(850);
                            backBasic7.setTranslateY(600);
                            group2.getChildren().addAll(backBasic7);

                            backBasic7.setOnMouseClicked(event3 -> {

                                Group group5 = new Group();
                                Scene scene3 = new Scene(group5, 900, 674);
                                scene3.getStylesheets().addAll(getClass().getResource("style.css").toString());
                                mainStage.setScene(scene3);

                                File file9 = new File("C:/Users/STRIX/Desktop/progi/ques11.png");
                                Image backImageBasic9 = new Image(file9.toURI().toString());
                                javafx.scene.image.ImageView backBasic9 = new javafx.scene.image.ImageView(backImageBasic9);
                                group5.getChildren().addAll(backBasic9);

                                File file8 = new File("C:/Users/STRIX/Desktop/progi/arrow.png");
                                Image backImageBasic8 = new Image(file8.toURI().toString());
                                javafx.scene.image.ImageView backBasic8 = new javafx.scene.image.ImageView(backImageBasic8);
                                backBasic8.getStyleClass().add("image");
                                backBasic8.setFitWidth(20);
                                backBasic8.setTranslateX(10);
                                backBasic8.setTranslateY(100);

                                File file10 = new File("C:/Users/STRIX/Desktop/progi/galochka.png");
                                Image backImageBasic10 = new Image(file10.toURI().toString());
                                javafx.scene.image.ImageView backBasic10 = new javafx.scene.image.ImageView(backImageBasic10);
                                backBasic10.getStyleClass().add("image");
                                backBasic10.setTranslateX(800);
                                backBasic10.setTranslateY(560);
                                group5.getChildren().addAll(backBasic8, backBasic10);

                                final ToggleGroup group3 = new ToggleGroup();
                                RadioButton firstAnswer = new RadioButton("Two versions");
                                firstAnswer.getStyleClass().add("buttons");
                                firstAnswer.setToggleGroup(group3);
                                firstAnswer.setPrefWidth(500);

                                RadioButton secondAnswer = new RadioButton("Just one version");
                                secondAnswer.getStyleClass().add("buttons");
                                secondAnswer.setToggleGroup(group3);
                                secondAnswer.setPrefWidth(500);


                                RadioButton thirdAnswer = new RadioButton("One for each platform");
                                thirdAnswer.getStyleClass().add("buttons");
                                thirdAnswer.setPrefWidth(500);
                                thirdAnswer.setToggleGroup(group3);


                                VBox vBox = new VBox();
                                vBox.getChildren().addAll(firstAnswer, secondAnswer, thirdAnswer);
                                vBox.setTranslateX(200);
                                vBox.setTranslateY(250);
                                vBox.setSpacing(15);
                                group5.getChildren().addAll(vBox);
                                backBasic8.setOnMouseClicked(event4 -> {
                                    mainStage.setScene(scene2);
                                });

                                backBasic10.setOnMouseClicked(event4 -> {
                                    if (secondAnswer.isSelected()) {

                                        Stage newStage = new Stage();
                                        Group group0 = new Group();
                                        Image image0 = new Image("1.gif");
                                        ImageView imageView = new ImageView(image0);
                                        group0.getChildren().add(imageView);
                                        Scene sceneGif = new Scene(group0, 400, 225);

                                        File file12 = new File("C:/Users/STRIX/Desktop/progi/arrow.png");
                                        Image backImageBasic12 = new Image(file12.toURI().toString());
                                        javafx.scene.image.ImageView backBasic12 = new javafx.scene.image.ImageView(backImageBasic12);
                                        backBasic12.getStyleClass().add("image");
                                        backBasic12.setFitWidth(20);
                                        backBasic12.setTranslateX(20);
                                        backBasic12.setTranslateY(190);


                                        group0.getChildren().addAll(backBasic12);
                                        newStage.setScene(sceneGif);
                                        newStage.show();
                                        mainStage.close();
                                        backBasic12.setOnMouseClicked(event5 -> {

                                            mainStage.show();
                                            newStage.close();
                                            Group group4 = new Group();
                                            Scene scene4 = new Scene(group4, 900, 674);
                                            scene4.getStylesheets().addAll(getClass().getResource("style.css").toString());
                                            mainStage.setScene(scene4);


                                            File file1234 = new File("C:/Users/STRIX/Desktop/progi/arrow.png");
                                            Image backImageBasic1234 = new Image(file1234.toURI().toString());
                                            javafx.scene.image.ImageView backBasic1234 = new javafx.scene.image.ImageView(backImageBasic1234);
                                            backBasic1234.getStyleClass().add("image");
                                            backBasic1234.setFitWidth(20);
                                            backBasic1234.setTranslateX(10);
                                            backBasic1234.setTranslateY(100);

                                            File file124 = new File("C:/Users/STRIX/Desktop/progi/galochka.png");
                                            Image backImageBasic124 = new Image(file124.toURI().toString());
                                            javafx.scene.image.ImageView backBasic124 = new javafx.scene.image.ImageView(backImageBasic124);
                                            backBasic124.getStyleClass().add("image");
                                            backBasic124.setTranslateX(800);
                                            backBasic124.setTranslateY(560);


                                            File file123 = new File("C:/Users/STRIX/Desktop/progi/HEllo.png");
                                            Image backImageBasic123 = new Image(file123.toURI().toString());
                                            javafx.scene.image.ImageView backBasic123 = new javafx.scene.image.ImageView(backImageBasic123);
                                            backBasic123.getStyleClass().add("image");

                                            backBasic12.setOnMouseClicked(event6 -> {
                                                mainStage.setScene(scene3);
                                            });

                                            backBasic124.setOnMouseClicked(event6 -> {
                                                mainStage.setScene(scenebasic);
                                            });

                                            group4.getChildren().addAll(backBasic123, backBasic12, backBasic124);


                                        });

//

                                    } else {

                                        Stage newStage = new Stage();
                                        Group group0 = new Group();
                                        Image image0 = new Image("2.gif");
                                        ImageView imageView = new ImageView(image0);
                                        group0.getChildren().add(imageView);
                                        Scene sceneGif = new Scene(group0, 320, 180);

                                        File file12 = new File("C:/Users/STRIX/Desktop/progi/arrow.png");
                                        Image backImageBasic12 = new Image(file12.toURI().toString());
                                        javafx.scene.image.ImageView backBasic12 = new javafx.scene.image.ImageView(backImageBasic12);
                                        backBasic12.getStyleClass().add("image");
                                        backBasic12.setFitWidth(20);
                                        backBasic12.setTranslateX(20);
                                        backBasic12.setTranslateY(150);


                                        group0.getChildren().addAll(backBasic12);
                                        newStage.setScene(sceneGif);
                                        newStage.show();
                                        mainStage.close();

                                        backBasic12.setOnMouseClicked(event5 -> {

                                            mainStage.show();
                                            newStage.close();
                                            Group group4 = new Group();
                                            Scene scene4 = new Scene(group4, 900, 674);
                                            scene4.getStylesheets().addAll(getClass().getResource("style.css").toString());
                                            mainStage.setScene(scene3);


                                            File file1234 = new File("C:/Users/STRIX/Desktop/progi/arrow.png");
                                            Image backImageBasic1234 = new Image(file1234.toURI().toString());
                                            javafx.scene.image.ImageView backBasic1234 = new javafx.scene.image.ImageView(backImageBasic1234);
                                            backBasic1234.getStyleClass().add("image");
                                            backBasic1234.setFitWidth(20);
                                            backBasic1234.setTranslateX(10);
                                            backBasic1234.setTranslateY(100);

                                            File file124 = new File("C:/Users/STRIX/Desktop/progi/galochka.png");
                                            Image backImageBasic124 = new Image(file124.toURI().toString());
                                            javafx.scene.image.ImageView backBasic124 = new javafx.scene.image.ImageView(backImageBasic124);
                                            backBasic124.getStyleClass().add("image");
                                            backBasic124.setTranslateX(800);
                                            backBasic124.setTranslateY(560);


                                            File file123 = new File("C:/Users/STRIX/Desktop/progi/HEllo.png");
                                            Image backImageBasic123 = new Image(file123.toURI().toString());
                                            javafx.scene.image.ImageView backBasic123 = new javafx.scene.image.ImageView(backImageBasic123);
                                            backBasic123.getStyleClass().add("image");

                                            backBasic12.setOnMouseClicked(event6 -> {
                                                mainStage.setScene(scene3);
                                            });

                                            backBasic124.setOnMouseClicked(event6 -> {
                                                mainStage.setScene(scenebasic);
                                            });

                                            group4.getChildren().addAll(backBasic123, backBasic12, backBasic124);


                                        });


                                    }
                                });
                            });
                        });
                        backBasic.setOnMouseClicked(event2 -> {
                            mainStage.setScene(sceneMain);
                        });

                        mainStage.setScene(scenebasic);
                    });


                    File filemain = new File("C:/Users/STRIX/Desktop/progi/sceneMain.png");
                    Image imagemain = new Image(filemain.toURI().toString());
                    javafx.scene.image.ImageView ivmain = new javafx.scene.image.ImageView(imagemain);
                    group.getChildren().addAll(ivmain, basicConcept, conditionalandloops);

                    mainStage.setScene(sceneMain);
                }
                it.close();
            } catch (FileNotFoundException e) {
            }
        });

        signUpW.setOnMouseClicked(event -> {

            Pane mainContainer0 = new Pane();
            mainContainer0.setId("mainContainer");

            VBox mainContainer = new VBox();
            mainContainer.setSpacing(15);
            TextField name = new TextField();
            name.setPromptText("Name");

            mainContainer.setTranslateY(120);
            mainContainer.setTranslateX(55);

            TextField surname = new TextField();
            surname.setPromptText("Surname");


            DatePicker birthDay = new DatePicker();
            birthDay.setPrefSize(305, 28.5);

            TextField registrationNickname = new TextField();
            registrationNickname.getStyleClass().add("TextField");
            registrationNickname.setPromptText("Nickname");

            Tooltip tooltip_userName = new Tooltip("Only English letters and numbers");
            registrationNickname.setTooltip(tooltip_userName);

            PasswordField passwordSign = new PasswordField();
            passwordSign.setPromptText("Password");

            passwordSign.setTooltip(tooltip_userName);


            File file3 = new File("C:/Users/STRIX/Desktop/progi/signup.png");
            Image signUpImageR = new Image(file3.toURI().toString());
            javafx.scene.image.ImageView signupR = new javafx.scene.image.ImageView(signUpImageR);

            signupR.getStyleClass().add("image");
            signupR.setTranslateX(94);

            File file4 = new File("C:/Users/STRIX/Desktop/progi/arrow.png");
            Image backImageR = new Image(file4.toURI().toString());
            javafx.scene.image.ImageView backR = new javafx.scene.image.ImageView(backImageR);
            backR.getStyleClass().add("image");

            backR.setOnMouseClicked(event1 -> {
                mainStage.setScene(sceneLogIn);
            });
            backR.setFitWidth(20);
            backR.setTranslateX(10);
            backR.setTranslateY(100);


            signupR.setOnMouseClicked(event1 -> {
                int a = 0;
                for (int index = 0; index < registrationNickname.getText().length(); index++) {
                    if ((((int) registrationNickname.getText().charAt(index) >= 97 && (int) registrationNickname.getText().charAt(index) <= 122) || ((int) registrationNickname.getText().charAt(index) >= 65 && (int) registrationNickname.getText().charAt(index) <= 90) || ((int) registrationNickname.getText().charAt(index) >= 48 && (int) registrationNickname.getText().charAt(index) <= 57))) {
                    } else {
                        Label checkinfo = new Label("Enter a valid nickname or password ");
                        mainContainer.getChildren().addAll(checkinfo);
                        a = 1;
                    }
                }
                for (int index = 0; index < passwordSign.getText().length(); index++) {
                    if ((((int) passwordSign.getText().charAt(index) >= 97 && (int) passwordSign.getText().charAt(index) <= 122) || ((int) passwordSign.getText().charAt(index) >= 65 && (int) passwordSign.getText().charAt(index) <= 90) || ((int) passwordSign.getText().charAt(index) >= 48 && (int) passwordSign.getText().charAt(index) <= 57))) {
                    } else {
                        Label checkinfo = new Label("Enter a valid nickname or password ");
                        mainContainer.getChildren().addAll(checkinfo);
                        a = 1;
                    }
                }


                if (a == 0) {
                    try {
                        PrintWriter printWriter = new PrintWriter(new FileOutputStream("users", true));
                        if (registrationNickname.getText().length() != 0 && name.getText().length() != 0 && surname.getText().length() != 0 && passwordSign.getText().length() != 0) {
                            printWriter.append(registrationNickname.getText() + " " + passwordSign.getText() + "\n");
                            printWriter.close();

                            mainStage.setScene(sceneLogIn);
                        }
                    } catch (FileNotFoundException e) {
                    }
                }
            });


            mainContainer.getChildren().addAll(backR, name, surname, birthDay, registrationNickname, passwordSign, signupR);
            mainContainer0.getChildren().addAll(mainContainer, backR);
            Scene signUpScene = new Scene(mainContainer0, 420, 525);
            signUpScene.getStylesheets().add(getClass().getResource("style.css").toString());
            mainStage.setScene(signUpScene);
            mainStage.show();
        });


        pane.getChildren().

                addAll(nickname, password);


        sceneLogIn.getStylesheets().

                add(getClass().

                        getResource("style.css").

                        toString());
        mainStage.setScene(sceneLogIn);
        mainStage.show();
    }
}
//    Group group2 = new Group();
//    Scene scene2 = new Scene(group2, 900, 674);
//                            scene2.getStylesheets().addAll(getClass().getResource("style.css").toString());
//                                    mainStage.setScene(scene2);


//    File file5 = new File("C:/Users/STRIX/Desktop/progi/arrow.png");
//    Image backImageBasic = new Image(file5.toURI().toString());
//    javafx.scene.image.ImageView backBasic = new javafx.scene.image.ImageView(backImageBasic);
//                        backBasic.getStyleClass().add("image");
//                                backBasic.setFitWidth(20);
//                                backBasic.setTranslateX(10);
//                                backBasic.setTranslateY(100);