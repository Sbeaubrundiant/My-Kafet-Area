import React from 'react';
import '../../App.css';
import { useHistory} from 'react-router-dom';
import { Button, Navbar } from 'react-bootstrap';
import { Formik } from 'formik';  
import { Radio , Checkbox  } from 'react-formik-ui'; 
import axios from 'axios'; 

export default function LunchItemCreate() {
  let history = useHistory();
        function handleClick() {
          history.push("/brigadearea");
        }
      
       function handleReset(){}
  
          
    return(
        <div id="App">
            <Navbar pageWrapId={"page-wrap"} outerContainerId={"App"} />
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
      initialValues={{ type: ''  ,  name: '' ,  description: '' ,  allergens: '' ,  price: '' , reservable: false }}
      onSubmit={(values) => {
        setTimeout(() => {
          axios({
            method: 'post', 
            url: 'http://localhost:8082/reac/lunchitems',
            data: {
              type: values.type,
              name: values.name,
              description: values.description,
              allergens: values.allergens,
              price:  values.price,
              reservable: values.reservable
            }

          })
          alert(JSON.stringify(values, null, 2));
          //setValues.setSubmitting(false);
        }, 1000);
      }}
    >
      {props => (
        <form onSubmit={props.handleSubmit} onReset={props.handleReset}>
          <div>
          
        <Radio
      inline
            id="radioGroup"
            type="radio"
            label="Type"
            name="type"
            options={[
              {value : 'starter' , label : 'Starter'},
              {value : 'main dish' , label : 'main_dish'},
              {value : 'dessert' , label : 'dessert'},
              {value : 'drink' , label : 'drink'}

            ]}
            onChange={props.handleChange}
            onBlur={props.handleBlur}
            value={props.values.type}
            
          />
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
          <Checkbox
      name='reservable'
      label='reservable'
      text='Available to reservation'
      
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