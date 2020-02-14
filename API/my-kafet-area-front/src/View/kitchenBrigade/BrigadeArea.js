import React from 'react';
import '../../App.css';
import SideBar from "../../Components/SideBar/SideBar.js";
import Button from 'react-bootstrap/Button';
import { useHistory} from 'react-router-dom';


export default function Brigadearea() {
// Redirect to LunchItemCreation page on the button click
    let history = useHistory();
        function handleClickCreation() {
          history.push("/LunchItemCreate");
        }
        function handleClickListItems() {
          history.push("/alllunchitems");
        }

    return(
        
    <div id="App">
            <SideBar pageWrapId={"page-wrap"} outerContainerId={"App"} />
            <div id="page-wrap">
                <h1 id="Pick-up-line">
                   Brigade Area
                </h1>
             </div>
             <div>
                <Button variant="primary" type="button" id="goToLunchItemCreation" onClick={handleClickCreation}>
            Create lunch items
                 </Button>
                 <Button variant="primary" type="button" id="goToLunchItemlist" onClick={handleClickListItems}>
            Retrieve all lunch items
                 </Button>

              </div>

     </div>
               
    )

}