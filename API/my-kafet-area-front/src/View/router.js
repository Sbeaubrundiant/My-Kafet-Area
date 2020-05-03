import React from "react";
import "../App.css";
import LoginPage from "./Login/LoginPage.js";
import CollaborArea from "./Collaborator/CollaborArea";
import NavBar from "../Components/NavBar/NavBar";
import { BrowserRouter as Router, Route, Link } from "react-router-dom";
import ForgottenPassword from "./Login/ForgottenPassword";
import ReservableItems from "./Collaborator/ReservableLunchItem";
import AllLunchItemsBrigade from "./kitchenBrigade/AllLunchItemsBrigade";
import LunchItemCreate from "./kitchenBrigade/LunchItemCreate";
import BrigadeArea from "./kitchenBrigade/BrigadeArea.js";

export default function AppRouter() {
  return (
    <Router>
      <NavBar />
      <Route exact path="/" component = { LoginPage } />
      <Route exact path="/forgottenpassword" component = { ForgottenPassword } />
      <Route exact path="/LunchItemCreate" component = { LunchItemCreate } />
      <Route exact path="/brigadearea" component = { AllLunchItemsBrigade } />
      <Route exact path="/alllunchitems" component= { AllLunchItemsBrigade } />
      <Route exact path="/collaboratorarea" component={CollaborArea} />
      <Route exact path="/reservableitems" component={ReservableItems} />
          </Router>
  );
}
