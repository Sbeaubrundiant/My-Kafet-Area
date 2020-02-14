import React from 'react';
import '../../App.css';
import SideBar from "../../Components/SideBar/SideBar.js";
import bonapp from "../../Components/View/bonapp.png";
import Button from 'react-bootstrap/Button';
import { useHistory} from 'react-router-dom';

export default function CollaborArea() {
    let history = useHistory();
    function handleClick() {
      history.push("/reservableitems");
    }
    return(
        <div id="App">
            <SideBar pageWrapId={"page-wrap"} outerContainerId={"App"} />
            <div id="page-wrap">
                <h1 id="Pick-up-line">
                     Collaborator Area
                </h1>
                <p>
                    Eat what you reserved... 
                    <img src={bonapp} alt="bonapp" id="bonapp" />
                </p>
            </div>
            <div>
             <Button variant="primary" type="button" id="goToReservableItems" onClick={handleClick} >
                 Compose your lunch bag
                 </Button>
        </div>      
            </div>

    )
}