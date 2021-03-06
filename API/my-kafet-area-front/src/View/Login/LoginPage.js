import React from "react";
import "../../App.css";
import NavBar from "../../Components/NavBar/NavBar";
import MKALogo from "./MKALogo.png";
import Form from "react-bootstrap/Form";
import Button from "react-bootstrap/Button";
import "bootstrap/dist/css/bootstrap.min.css";
import { useHistory } from "react-router-dom";

export default function LoginPage() {
  // function push vers url et mon onclick appel la fonction push
  let history = useHistory();
  function handleClickForgotPass() {
    history.push("/forgottenPassword");
  }
  function handleClickBrigade(){ 
    history.push("/brigadearea");}
    function handleClickCollaborator(){
    history.push("/collaboratorarea");}
 
  return (
    <div id="App">
      
      <div id="page-wrap">
        
          <img  id="mkalogo" src={MKALogo} alt="LOGO" />
    
        <h2 id="Pick-up-line">Your optimised canteen way...</h2>
      </div>
      <div>
        <Form method="post">
          <Form.Group controlId="formBasicEmail">
            <Form.Control type="email" name="loginEmail" placeholder="Enter email"  required/>
            <Form.Text className="text-muted">
              We'll never share your email with anyone else.
            </Form.Text>
          </Form.Group>
          <Form.Group controlId="formBasicPassword">
            <Form.Control type="password" name="loginPassword" placeholder="Password"  required/>
          </Form.Group>
          <Button variant="primary" type="submit" id="homeSubmitButton">
            Login
          </Button>
          <Button variant="primary" type="button" id="homeForgotPassword" onClick={handleClickForgotPass}>
            Forgotten Password
          </Button>
        </Form>
      </div>
    </div>
  );
}
