import React from 'react';
import '../App.css';
import Login from './Login/Login.js';
import SideBar from "../Components/SideBar/SideBar.js";
import { BrowserRouter as Router, Route } from 'react-router-dom';
import Starters from './Collaborator/Starters.js';
import Dishes from './Collaborator/Dishes.js';
import ForgottenPassword from './Collaborator/ForgottenPassword.js';

export default function AppRouter() {
  return (
    <Router>
      <SideBar />
      <Route exact path="/" component={props => <Login {...props} />} />
      <Route exact path="/starters" component={props => <Starters {...props} />} />
      <Route exact path="/dishes" component={props => <Dishes {...props} />} />
      <Route exact path="/forgottenpassword" component={props => <ForgottenPassword {...props} />} />

      
    </Router>

  )
}
