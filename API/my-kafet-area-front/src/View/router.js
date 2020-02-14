import React from "react";
import "../App.css";
import LoginPage from "./Login/LoginPage.js";
import CollaborArea from "./Collaborator/CollaborArea";
import SideBar from "../Components/SideBar/SideBar.js";
import { BrowserRouter as Router, Route } from "react-router-dom";
import ForgottenPassword from "./Login/ForgottenPassword";
import ReservableItems from "./Collaborator/ReservableLunchItem";
import AllLunchItemsBrigade from "./kitchenBrigade/AllLunchItemsBrigade";
import LunchItemCreate from "./kitchenBrigade/LunchItemCreate";
import BrigadeArea from "./kitchenBrigade/BrigadeArea.js";

export default function AppRouter() {
  return (
    <Router>
      <SideBar />
      <Route exact path="/" component={props => <LoginPage {...props} />} />
      <Route exact path="/forgottenpassword" component={props => <ForgottenPassword {...props} />} />
      <Route exact path="/LunchItemCreate" component={props => <LunchItemCreate {...props} />} />
      <Route exact path="/brigadearea" component={props => <BrigadeArea {...props} />} />
      <Route exact path="/alllunchitems" component={props => <AllLunchItemsBrigade {...props} />} />
      <Route exact path="/collaboratorarea" component={props => <CollaborArea {...props} />} />
      <Route exact path="/reservableitems" component={props => <ReservableItems {...props} />} />
          </Router>
  );
}
