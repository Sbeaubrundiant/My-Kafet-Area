import React from 'react';
import '../../App.css';
import SideBar from "../../Components/SideBar/SideBar.js";
import { useHistory} from 'react-router-dom';
import Button from 'react-bootstrap/Button';
import { Formik } from 'formik';
import { resetForm } from 'react';

export default function CulinaryProposition() {

    // Rappel de la page précédente 
    let history = useHistory();
        function handleClick() {
          history.push("/Brigadearea");
        }
    
      
    
        
    return(
        <div id="App">
            <SideBar pageWrapId={"page-wrap"} outerContainerId={"App"} />
            <div id="page-wrap">
                <h1 id="Pick-up-line">
                Propositions Area
                </h1>
                
        <div>
                
  <div>
    
    <Formik
      initialValues={{ Name: '' }, { Description: '' }, { Allergens: '' }, { price: '' }}
      onSubmit={(values, actions) => {
        setTimeout(() => {
          alert(JSON.stringify(values, null, 2));
          actions.setSubmitting(false);
        }, 1000);
      }}
    >
      {props => (
        <form onSubmit={props.handleSubmit}>
            <label id="radiobutton">
            <input
              id="radiobutton"
              type="radio"
              name="react-tips"
              value="starter"
              className="form-check-input"
            />
           Starter
          </label>
          <label id="radiobutton">
            <input
            id="radiobutton"
              type="radio"
              name="react-tips"
              value="mainDish"
              className="form-check-input"
            />
            Main dish
          </label>
          <label id="radiobutton">
            <input
            id="radiobutton"
              type="radio"
              name="react-tips"
              value="Dessert"
              className="form-check-input"
            />
            Dessert
          </label>
          <label id="radiobutton">
            <input
            id="radiobutton"
              type="radio"
              name="react-tips"
              value="Drink"
              className="form-check-input"
            />
            Drink
    
          </label>
            <label>
            {/* Select your culinary proposition type : */}
          {/* <select >
            <option value="Starter">Starter</option>
            <option value="Main dish">Main dish</option>
            <option value="Dessert">Dessert</option>
            <option value="Drink">Drink</option>
          </select> */}
        </label>
          <input
            id="formField"
            type="text"
            placeholder="Write a culinary proposition name"
            onChange={props.handleChange}
            onBlur={props.handleBlur}
            value={props.values.name}
            name="name"
          />
          <input
            id="formField"
            type="text"
            placeholder="Write a description"
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
            placeholder="Price"
            onChange={props.handleChange}
            onBlur={props.handleBlur}
            value={props.values.price}
            name="price"
          />

          {props.errors.name && <div id="feedback">{props.errors.name}</div>}
          {props.errors.description && <div id="feedback">{props.errors.description}</div>}
          {props.errors.allergens && <div id="feedback">{props.errors.allergens}</div>}
          {props.errors.price && <div id="feedback">{props.errors.price}</div>}
          

        </form>
      )}
    </Formik>
  </div>

    </div>
    </div>
            <Button variant="primary" type="Button" id="createPropositionButton" onClick={onsubmit}>Create</Button>
            <Button  variant="primary" type="reset" id="resetPropositionForm" onClick={resetForm}>Reset</Button>
            <Button variant="primary" type="submit" id="backToBrigadeButton" onClick={handleClick}>
            Back to Brigade Area
                 </Button>
                </div>
    )

}