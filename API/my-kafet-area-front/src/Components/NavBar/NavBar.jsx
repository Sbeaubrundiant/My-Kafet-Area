import React from "react";
import Navbar from 'react-bootstrap/Navbar';
import  Nav  from 'react-bootstrap/Nav';
import NavDropdown from 'react-bootstrap/NavDropdown';
import Form from 'react-bootstrap/Form';
import FormControl from 'react-bootstrap/FormControl';
import Button from 'react-bootstrap/Button';
import LoginPage from "../../View/Login/LoginPage";


export default props => {
    return (
        <Navbar bg="dark" variant="dark" expand="lg">
        <Navbar.Brand href="#home">MKA</Navbar.Brand>
        <Navbar.Toggle aria-controls="basic-navbar-nav" /><Navbar.Collapse id="basic-navbar-nav">
          <Nav className="mr-auto">
        
            <Nav.Link href="/">Home</Nav.Link>
            <Nav.Link href="/brigadearea">Brigade Area</Nav.Link>
            <Nav.Link href="/collaboratorarea">Collaborator Area</Nav.Link>
            <NavDropdown title="Settings" id="b asic-nav-dropdown">
              <NavDropdown.Item href="#action/3.1">Settings</NavDropdown.Item>
              <NavDropdown.Item href="#action/3.2">FAQ</NavDropdown.Item>
              <NavDropdown.Item href="#action/3.3">About us</NavDropdown.Item>
              <NavDropdown.Divider />
              <NavDropdown.Item href="#action/3.4">Account</NavDropdown.Item>
            </NavDropdown>
          </Nav>
          <Form inline>
            <FormControl type="text" placeholder="Search" className="mr-sm-2" />
            <Button variant="outline-success">Search</Button>
          </Form>
        </Navbar.Collapse>
      </Navbar>
    );
  };
  