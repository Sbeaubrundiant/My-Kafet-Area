import React from 'react';
import '../../App.css';
import Form from 'react-bootstrap/Form';
import Button from 'react-bootstrap/Button';
import Navbar from '../../Components/NavBar/NavBar';


export default function ForgottenPassword() {
  return (
    <div id="App">
      <Navbar pageWrapId={"page-wrap"} outerContainerId={"App"} />
      <div id="page-wrap">
        <h1>

        </h1>
        <h2 id="Pick-up-line">Fill in with your registration email </h2>
      </div>
      <div>
      <Form>
        <Form.Group controlId="formBasicEmail">
          <Form.Control type="email" placeholder="Enter email" />
          <Form.Text className="text-muted">
            You should use your registered mail
  </Form.Text>
        </Form.Group>


        <Button variant="primary" type="submit" id="homeSubmitButton">
          Send me the password
        </Button>

      </Form>
      </div>
</div>
  )
  }
