import React from 'react';
import '../../App.css';
import SideBar from "../../Components/SideBar/SideBar.js";
import bonapp from "../../Components/View/bonapp.png";

export default function HomeCollaborator() {
    return(
        <div id="App">
            <SideBar pageWrapId={"page-wrap"} outerContainerId={"App"} />
            <div id="page-wrap">
                <h1 id="Pick-up-line">
                    Welcome to your Area !! 
                </h1>
                <p>
                    So what do you deserve to eat 
                    <img src={bonapp} alt="bonapp" id="bonapp" />
                </p>

            
            </div>
            <div id="reservedStarter">
                <h2 id="reservedTitle">
                   Your Starter :                       
                </h2>
            </div>
            <div id="reservedDishe">
                <h2 id="reservedTitle">
                    Your Dishe : 
                </h2>
            </div>
            <div id="reservedDessert">
                <h2 id="reservedTitle">
                    Your Dessert :
                </h2>
            </div>
            <div id="reservedDrink">
                <h2 id="reservedTitle">
                    Your Drink :
                </h2>
            </div>
        </div>

    )
}