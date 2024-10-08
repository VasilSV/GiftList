
import axios from 'axios';

const API_URL = 'http://localhost:8080/api';

export const getAllUsers = () => {
    return axios.get(`${API_URL}/users`);
}
