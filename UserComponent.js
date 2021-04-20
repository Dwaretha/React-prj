import React from 'react';
import UserService from '../services/UserService';

class UserComponent extends React.Component {

    constructor(props) {
        super(props)
        this.state = {
            Users:[]
        }
    }

    componentDidMount() {
        UserService.getUsers().then((Response)=> {
            this.setState({Users:Response.data})
        })
    }
    render() {
        return (
            <div>
                
                <table className="table table-striped block1">
                    <thead>
                        <tr>
                            <td> Id</td>
                            <td> Name</td>
                            <td> Topic</td>
                            <td> MemberNames</td>
                            <td>  Email</td>
                        </tr>
                    </thead>
                    <tbody>
                        {
                            this.state.Users.map(
                                User =>
                                <tr key = {User.id}>
                                    <td> {User.id}</td>
                                    <td> {User.name}</td>
                                    <td> {User.topic}</td>
                                    <td> {User.membernames}</td>
                                    <td> {User.email }</td>
                            </tr>
                            )
                        }
                    </tbody>
                </table>
            </div>


        )
    }
}

export default UserComponent