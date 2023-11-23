import React from "react";
import { useHistory } from "react-router-dom";
import { Container, Form, Button, Row, Col, Image } from "react-bootstrap";
import logo from "./MKALogo.png";


export default function LoginPage() {
  let history = useHistory();

  function handleClickForgotPass() {
    history.push("/forgottenPassword");
  }

  function handleClickBrigade() {
    history.push("/brigadearea");
  }

  function handleClickCollaborator() {
    history.push("/collaboratorarea");
  }

  return (
    <Container fluid id="login-page">
      <Row>
        <Col className="text-center">
          <Image src={logo} alt="MKALogo" id="logo" />
          <h2 className="mt-4">Your smart way to lunch...</h2>
        </Col>
      </Row>
      <Row className="justify-content-center mt-5">
        <Col md={6}>
          <Form method="post">
            <Form.Group controlId="formBasicEmail">
              <Form.Control
                type="email"
                name="loginEmail"
                placeholder="Enter email"
                required
              />
            </Form.Group>

            <Form.Group controlId="formBasicPassword">
              <Form.Control
                type="password"
                name="loginPassword"
                placeholder="Password"
                required
              />
            </Form.Group>
            <Col className="text-center">
            <Button variant="primary" type="submit" id="homeSubmitButton">
              Login
            </Button>
            <Button
              variant="link"
              type="button"
              id="homeForgotPassword"
              onClick={handleClickForgotPass}
            >
              Forgotten Password
            </Button>
            </Col>
          </Form>
        </Col>
      </Row>
    </Container>
  );
}
