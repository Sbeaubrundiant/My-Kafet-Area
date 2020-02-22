import axios from 'axios'



class LunchItemDataService {

    retrieveReservableLunchItems(reservable) {
        return axios.get('http://localhost:8082/reac/lunchitems/true');
    };
    retrieveAllLunchItems(all) {
        return  axios.get('http://localhost:8082/reac/lunchitems/all');
    }

}

export default new LunchItemDataService()