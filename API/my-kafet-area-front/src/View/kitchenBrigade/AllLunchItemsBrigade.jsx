import React,{ useState , useEffect } from 'react';
import LunchItemDataService from "../../service/LunchItemDataService";
import '../../App.css';
import Button from 'react-bootstrap/Button';
import { useHistory} from 'react-router-dom';
import { Navbar, Table } from 'react-bootstrap';
import LunchItemCard from '../../Components/LunchItemCard';


export default function AllLunchItems()  {
        let history = useHistory();
        
        function handleClick() {
          history.push("/brigadearea");
        }
 
        const [lunchItems, setLunchItems] = useState({ lunchItems: [] });
        

        useEffect(()=>{
            LunchItemDataService.retrieveAllLunchItems(AllLunchItems)
        .then(
            response => {
                console.log(response);
                setLunchItems( { lunchItems : response.data})
            }
        )

        }, [])
        

        
        return(
            <div id="App">
                <Navbar pageWrapId={"page-wrap"} outerContainerId={"App"} />
                <div id="page-wrap">
                    <h1 id="Pick-up-line">
                         All Lunch Items
                    </h1>
               </div>
                 <div>
                            <Table responsive="sm"  className="table">
                      <thead>
                        <tr>
                            <th id=" brigadeArrayColumnsTitle ">Type</th>
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
                    </Table>
                </div>
               
   
                     
                </div>
    
        )
       
}