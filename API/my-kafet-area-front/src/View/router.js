import React from "react";
import "../App.css";
import LoginPage from "./Login/LoginPage.js";
import HomeCollaborator from "./Collaborator/HomeCollaborator.js";
import SideBar from "../Components/SideBar/SideBar.js";
import { BrowserRouter as Router, Route } from "react-router-dom";
import Starters from "./Collaborator/Starters.js";
import Dishes from "./Collaborator/Dishes.js";
import ForgottenPassword from "./Login/ForgottenPassword";
import Desserts from "./Collaborator/Desserts.js";
import LunchItemCreation from "./kitchenBrigade/LunchItemCreation.js";
import BrigadeArea from "./kitchenBrigade/BrigadeArea.js";

export default function AppRouter() {
  return (
    <Router>
      <SideBar />
      <Route exact path="/" component={props => <LoginPage {...props} />} />
      <Route exact path="/homecollaborator" component={props => <HomeCollaborator {...props} />} />
      <Route exact path="/starters" component={props => <Starters {...props} />} />
      <Route exact path="/dishes" component={props => <Dishes {...props} />} />
      <Route exact path="/desserts" component={props => <Desserts {...props}/>} />
      <Route exact path="/forgottenpassword" component={props => <ForgottenPassword {...props} />} />
      <Route exact path="/LunchItemCreation" component={props => <LunchItemCreation {...props} />} />
      <Route exact path="/brigadearea" component={props => <BrigadeArea {...props} />} />
          </Router>
  );
}
