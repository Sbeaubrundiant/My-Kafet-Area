import React from 'react';
import SideBar from "../../Components/SideBar/SideBar";
import '../../App.css';


export default function Dishes() {
  return (
    <div id="App">
      <SideBar pageWrapId={"page-wrap"} outerContainerId={"App"} />
      <div id="page-wrap">
        <h1 id="Pick-up-line">
          Choose your Dish
        </h1>
      </div>
</div>
  )
  }
