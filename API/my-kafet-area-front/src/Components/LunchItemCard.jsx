import React, { FunctionComponent, useState, useEffect } from 'react';
import { useHistory } from 'react-router-dom';
import LunchItemDataService from '../service/LunchItemDataService';
import { type } from 'os';
import Card from 'react-bootstrap/Card';
import Container from 'react-bootstrap/Container';


export default function LunchItemCard() {
    
    const [lunchItems, setLunchItems] = useState({ lunchItems: [] });
        

        useEffect(()=>{
            LunchItemDataService.retrieveAllLunchItems(LunchItemCard)
        .then(
            response => {
                console.log(response);
                setLunchItems( { lunchItems : response.data})
            }
        )

        }, [])


    return(

        <Container>
        <div>
            <Card style={{ width: '18rem' }}>
  <Card.Body>     
    <Card.Title> LunchItem Card  </Card.Title>
    <Card.Subtitle className="mb-2 text-muted"></Card.Subtitle>
    <Card.Text>
{
        lunchItems.lunchItems.map(
            lunchItems =>
        <tr key={lunchItems.id}>
        <p>{lunchItems.type}</p>
        <p>{lunchItems.name}</p>
        <p>{lunchItems.description}</p>
        <p>{lunchItems.allergens}</p>
        <p>{lunchItems.price}</p>
    </tr>
        )
    }
      
    </Card.Text>
    <Card.Link href="#">Détails...</Card.Link>
    </Card.Body>
</Card>
        </div>
        </Container>
    
        )
        
}



