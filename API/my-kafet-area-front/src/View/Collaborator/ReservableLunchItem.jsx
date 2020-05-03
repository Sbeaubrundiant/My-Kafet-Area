import React, { useState , useEffect } from "react";
import LunchItemDataService from "../../service/LunchItemDataService";
import Button from 'react-bootstrap/Button';
import { useHistory} from 'react-router-dom';
import Navbar from '../../Components/NavBar/NavBar';



export default function ReservableLunchItem() {

    let history = useHistory();
    function handleClickValidLunchBag() {
      history.push("/reservableitems");
    }
    function handleClickGoToCollaboratorArea() {
        history.push("/collaboratorarea")
    }

    const [lunchItems, setLunchItems] = useState({ lunchItems: [] });

    useEffect(()=>{
        LunchItemDataService.retrieveReservableLunchItems(ReservableLunchItem)
        .then(
            response => {
                console.log(response);
                setLunchItems( { lunchItems : response.data})
            }
        )
        
    },[])
       
    
   
        return (
            <div id="App">
            <Navbar pageWrapId={"page-wrap"} outerContainerId={"App"} />
            <div id="page-wrap">
                <h1 id="Pick-up-line">
                   Compose your lunch bag
                </h1>
                <p>
                        <h3>Eat what you reserved... </h3>
                    </p>
                    <table   className="table">
                      <thead>
                        <tr>
                            <th>Type</th>
                            <th>Name</th>
                            <th>Description</th>
                            <th>Allergens</th>
                            <th>Price</th>
                        </tr>
                     </thead>
                        <tbody>
                            {
                               lunchItems.lunchItems.map(
                                    lunchItems =>
                                <tr key={lunchItems.id}>
                                <td>{lunchItems.type}</td>
                                <td>{lunchItems.name}</td>
                                <td>{lunchItems.description}</td>
                                <td>{lunchItems.allergens}</td>
                                <td>{lunchItems.price}</td>
                            </tr>
                                )
                        }
                        </tbody>
                    </table>
                </div>
                <div>
             <Button variant="primary" type="submit" id="validLunchBag" onClick={handleClickValidLunchBag} >
                 Valid your lunch bag
             </Button>
             <Button variant="primary" type="button" id="goToCollaborartorArea" onClick={handleClickGoToCollaboratorArea} >
                 Back to Collaborator Area
             </Button>

        </div>      

            </div>
        )

}
