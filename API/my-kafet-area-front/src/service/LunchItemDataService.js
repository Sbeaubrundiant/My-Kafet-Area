import axios from 'axios';

const BASE_URL = 'http://localhost:8082/reac/lunchitems/';

class LunchItemDataService {
    async retrieveReservableLunchItems() {
        try {
            const response = await axios.get(`${BASE_URL}true`);
            return response.data;
        } catch (error) {
            console.error('Erreur lors de la récupération des articles réservables :', error);
            throw error;
        }
    }

    async retrieveAllLunchItems() {
        try {
            const response = await axios.get(`${BASE_URL}all`);
            return response.data;
        } catch (error) {
            console.error('Erreur lors de la récupération de tous les articles :', error);
            throw error;
        }
    }
}

export default new LunchItemDataService();
