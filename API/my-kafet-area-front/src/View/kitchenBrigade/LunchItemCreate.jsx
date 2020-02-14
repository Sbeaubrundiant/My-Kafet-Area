import React from 'react';
import '../../App.css';
import SideBar from "../../Components/SideBar/SideBar.js";
import { useHistory} from 'react-router-dom';
import { Button , ButtonGroup, ToggleButton } from 'react-bootstrap';
import { Formik } from 'formik';  

export default function LunchItemCreate() {
  let history = useHistory();
        function handleClick() {
          history.push("/brigadearea");
        }
      
       function handleReset(){}
  
          
    return(
        <div id="App">
            <SideBar pageWrapId={"page-wrap"} outerContainerId={"App"} />
          <div id="page-wrap">
              <div>
                <h1 id="Pick-up-line">
                Lunch Items Creation
                </h1>
              </div>
                <h3 id="Pick-up-secondTitle">
                    Select your lunch item  type :
                </h3>
          <div>
                
          <div>
    
    <Formik
      initialValues={{ Type: '' }, { Name: '' }, { Description: '' }, { Allergens: '' }, { price: '' }}
      onSubmit={(values, setValues) => {
        setTimeout(() => {
          alert(JSON.stringify(values, null, 2));
          setValues.setSubmitting(false);
        }, 1000);
      }}
    >
      {props => (
        <form onSubmit={props.handleSubmit} onReset={props.handleReset}>
          <div>
          
          <ButtonGroup toggle className="radioGroup">
    <ToggleButton id="radioGroup" variant="outline-primary" type="radio" name="radio" defaultChecked value={props.values.type}>
      Starter
    </ToggleButton>
    <ToggleButton id="radioGroup" variant="outline-primary" type="radio" name="radio" value={props.values.main_dish}>
      Main dish
    </ToggleButton>
    <ToggleButton id="radioGroup" variant="outline-primary" type="radio" name="radio" value={props.values.dessert}>
      Dessert
    </ToggleButton>
    <ToggleButton id="radioGroup" variant="outline-primary" type="radio" name="radio" value={props.values.drink}> 
      Drink
    </ToggleButton>
    </ButtonGroup>
          
          </div>
          <div>
          <input
            id="formField"
            type="text"
            placeholder="Lunch item name"
            onChange={props.handleChange}
            onBlur={props.handleBlur}
            value={props.values.name}
            name="name"
          />
          <input
            id="formField"
            type="text"
            placeholder="Description"
            onChange={props.handleChange}
            onBlur={props.handleBlur}
            value={props.values.description}
            name="description"
          />
           <input
            id="formField"
            type="text"
            placeholder="List all allergens"
            onChange={props.handleChange}
            onBlur={props.handleBlur}
            value={props.values.allergens}
            name="allergens"
          />
          <input
            id="formField"
            type="number"
            placeholder="Price in euro"
            onChange={props.handleChange}
            onBlur={props.handleBlur}
            value={props.values.price}
            name="price"
          />
          </div>

          {props.errors.name && <div id="feedback">{props.errors.name}</div>}
          {props.errors.description && <div id="feedback">{props.errors.description}</div>}
          {props.errors.allergens && <div id="feedback">{props.errors.allergens}</div>}
          {props.errors.price && <div id="feedback">{props.errors.price}</div>}
          
          <Button variant="primary" type="submit" id="createPropositionButton" onClick={onsubmit}>Create</Button>
            <Button  variant="primary" type="reset" id="resetPropositionForm" onClick={handleReset}>Reset</Button>
            <Button variant="primary" type="submit" id="backToBrigadeButton" onClick={handleClick}>
            Back to Brigade Area
                 </Button>
        </form>
      )}
    </Formik>
  </div>

    </div>
    </div>
            
                </div>
    )

}